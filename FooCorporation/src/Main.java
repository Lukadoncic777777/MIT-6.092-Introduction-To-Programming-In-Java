class FooCorporation {
    public static void main(String[] args)
    {
        System.out.println(wages(7.5,35));;
        System.out.println(wages(8.2,47));
        System.out.println(wages(10,73));
    }
    public static double wages(double basic_wages,double worktime)
    {
        if(worktime>60.0||basic_wages<8.0)
        {
            return -1;
        }
        if(worktime<=40.0)
        {
            return basic_wages*worktime;
        }

        return 40.0*basic_wages+(worktime-40.0)*basic_wages*1.5;
    }
}