
class Holiday
{
    private String name;
    private int day;
    private String month;

    public Holiday(String name, int day, String month)
    {
        this.name = name;
        this.day = day;
        this.month = month;
    }
    public boolean isSameMonth(Holiday hd)
    {
        return this.month.equals(hd.month);
    }
    public static double avgDate(Holiday[] ho)
    {
        int sum = 0;
        for (int i = 0; i < ho.length; i++)
            sum += ho[i].day;
        return ((double) sum)/ ho.length;
    }


}
public class CheckHoliday {
    public static void main(String[] args) {
        Holiday h1 = new Holiday("Independence Day", 4, "July");
        Holiday h2 = new Holiday("Republic Day", 26, "January");
        Holiday dates[] = new Holiday[2];
        dates[0] = h1;
        dates[1] = h2;
        System.out.println(h1.isSameMonth(h2));
        System.out.println(Holiday.avgDate(dates));
    }

}
