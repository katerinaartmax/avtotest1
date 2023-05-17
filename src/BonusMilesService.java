public class BonusMilesService {
    public int calculate(int ticketPrice) {
        int milesPerRub = 20; // количество рублей за 1 милю
        int miles = ticketPrice / milesPerRub; // расчет количества миль
        return miles;
    }
}