package streams;

import polymorphism.method_overriding.example_1.A;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Client {


    public static void main(String[] args) {
        //Given a table called as transactions, write sql query to print
        // transactions ids for upi in descending order as per their amounts.

        //select id from Transactions where type='UPI' order by amount desc;
        // SQL is declarative, you focus on what

        List<Transaction> upiTransactions = new ArrayList<>();
        List<Transaction> allTransactions = getTransactions();
        for (Transaction transaction : allTransactions) {
            if(transaction.getType().equals(TransactionType.UPI)){
                upiTransactions.add(transaction);
            }
        }
        upiTransactions.sort(new Comparator<Transaction>() {
            @Override
            public int compare(Transaction o1, Transaction o2) {
                return o2.getAmount().compareTo(o1.getAmount());
            }
        });
        System.out.println(upiTransactions);
        List<Integer> ids = new ArrayList<>();
        for (Transaction upiTransaction : upiTransactions) {
            ids.add(upiTransaction.getId());
        }
        System.out.println(ids);

        // Java is imperative, you focus on how
        List<Integer> upiTrnasactionsViaStreams = allTransactions.stream()
                .filter(x -> x.getType().equals(TransactionType.UPI))
                .sorted((a,b) -> b.getAmount().compareTo(a.getAmount()))
                .map(Transaction::getId)
                .collect(Collectors.toList());
//        System.out.println(upiTrnasactionsViaStreams);
//        upiTrnasactionsViaStreams.forEach(System.out::println);

/**
        A short definition is “a sequence of elements from a source that
        supports aggregate operations.” Let’s break it down:

        Sequence of elements: A stream provides an interface to a sequenced set of values of a specific element type.
        However, streams don’t actually store elements; they are computed on demand.

        Source: Streams consume from a data-providing source such as collections, arrays, or I/O resources.
        Aggregate operations: Streams support SQL-like operations and common operations from functional programing languages, such as filter, map, reduce, find, match, sorted, and so on.
        Furthermore, stream operations have two fundamental characteristics that make them very different from collection operations:
        Pipelining: Many stream operations return a stream themselves. This allows operations to be chained to form a larger pipeline. This enables certain optimizations, such as laziness and short-circuiting, which we explore later.
        Internal iteration: In contrast to collections, which are iterated explicitly (external iteration), stream operations do the iteration behind the scenes for you.

               */

        /**
         *
         * Intermediate Operations:
         *
         * filter: Filters the elements of a stream based on a specified condition.
         * map: Transforms each element of a stream to another object using a provided function.
         * flatMap: Flattens nested collections and maps each element to a stream and then concatenates them into a single stream.
         * distinct: Returns a stream with unique elements (removes duplicates).
         * sorted: Sorts the elements of a stream based on a provided comparator or natural ordering.
         * limit: Limits the size of a stream to a given number of elements.
         * skip: Skips the specified number of elements from the start of a stream.
         *
         *
         *
         * Terminal Operations:
         *
         * forEach: Performs an action for each element in the stream.
         * collect: Accumulates the elements of a stream into a collection or a single value.
         * reduce: Performs a reduction operation on the elements of a stream to produce a single value.
         * count: Returns the count of elements in a stream.
         * anyMatch: Checks if any element in the stream matches a given condition.
         * allMatch: Checks if all elements in the stream match a given condition.
         * noneMatch: Checks if no elements in the stream match a given condition.
         * findFirst: Returns the first element in the stream.
         * findAny: Returns any element in the stream.
         */

        long count = allTransactions.stream()
                .filter(x -> x.getType().equals(TransactionType.UPI))
                .sorted((a, b) -> b.getAmount().compareTo(a.getAmount()))
                .map(Transaction::getId)
                .count();
        System.out.println(count);

        System.out.println(allTransactions.stream()
                .mapToInt(Transaction::getAmount)
                        .sum());

        Stream<Transaction> transactionStream = allTransactions.stream()
                .filter(x -> {
                    System.out.println("Amount:" + x.getAmount());
                    return x.getAmount() > 10000;
                });
        System.out.println("DEBUG");
        long c  = transactionStream.count();
        System.out.println(c);
        System.out.println("------------");
        Arrays.asList(1,2,3,4,6,4,5,5,6,7,6,6,6,7).stream().limit(4).distinct().sorted().forEach(System.out::println);
        System.out.println("------------");
        Arrays.asList(1,2,3,4,6,4,5,5,6,7,6,6,6,7).stream().skip(4).distinct().sorted().forEach(System.out::println);

        Stream<Integer> integerStream = Stream.of(1, 2,3,4,5,6);
        Optional<Integer> opt = integerStream.reduce((a, b) -> a + b);
        opt.ifPresent(System.out::println);

        boolean anyMatch = Stream.of(1, 2, 3, 4, 5, 6)
                .anyMatch(x -> {
                    System.out.println("Checking condition for  " + x);
                    return x % 2 == 0;
                });
        System.out.println(anyMatch);

        boolean allMatch = Stream.of(1, 2, 3, 4, 5, 6)
                .allMatch(x -> {
                    System.out.println("Checking condition for  " + x);
                    return x % 2 == 0;
                });
        System.out.println(allMatch);

        boolean noneMatch = Stream.of(1, 2, 3, 4, 5, 6)
                .noneMatch(x -> {
                    System.out.println("Checking condition for  " + x);
                    return x % 2 == 0;
                });
        System.out.println(noneMatch);

        Optional<Transaction> first = allTransactions.stream()
                .filter(x -> x.getType().equals(TransactionType.UPI))
                .findFirst();
        if(first.isPresent()){
            System.out.println("UPI transactions found");
            Transaction transaction = first.get();
            System.out.println(transaction);
        } else {
            System.out.println("No UPI transactions");
        }

        Optional<Transaction> any = allTransactions.parallelStream()
                .filter(x -> x.getType().equals(TransactionType.UPI))
                .findAny();
        if(any.isPresent()){
            System.out.println("UPI transactions found");
            Transaction transaction = any.get();
            System.out.println(transaction);
        } else {
            System.out.println("No UPI transactions");
        }
    }


    public static List<Transaction> getTransactions(){
        List<Transaction> list = new ArrayList<>();
        list.add(new Transaction(1,200, TransactionType.CC));
        list.add(new Transaction(2,100, TransactionType.DC));
        list.add(new Transaction(3,453, TransactionType.UPI));
        list.add(new Transaction(4, 12334, TransactionType.CC));
        list.add(new Transaction(5, 56709, TransactionType.DC));
        list.add(new Transaction(6, 82347, TransactionType.UPI));
        return list;
    }
}
