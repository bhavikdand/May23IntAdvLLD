package machine_coding_projects.parking_lot.factories;

import machine_coding_projects.parking_lot.strategies.pricing_strategy.PricingStrategy;
import machine_coding_projects.parking_lot.strategies.pricing_strategy.WeekdayPricingStrategy;
import machine_coding_projects.parking_lot.strategies.pricing_strategy.WeekendPricingStrategy;

import java.util.Calendar;
import java.util.Date;

public class PricingStrategyFactory {

    private PricingStrategy weekDayPricing;
    private PricingStrategy weekEndPricing;

    public PricingStrategyFactory(PricingStrategy weekendPricing, PricingStrategy weekDayPricing) {
        this.weekEndPricing = weekendPricing;
        this.weekDayPricing = weekDayPricing;
    }

    public PricingStrategy getPricingStrategy(Date exitTime){
        Calendar cal = Calendar.getInstance();
        cal.setTime(exitTime);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        if(dayOfWeek == 1 || dayOfWeek == 7){
            return weekEndPricing;
        }
        else {
            return weekDayPricing;
        }
    }
}
