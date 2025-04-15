class Marathon {
    public static void main (String[] arguments) {
        String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"
        };
        int[] shabi=new int[50];
        int[] times = {
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265
        };
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i] + ": " + times[i]);
//        }
        int goat=fastest(names,times);
        System.out.println(names[goat]+":"+times[goat]);
        int James=SecondFastest(names,times);
        System.out.println(names[James]+":"+times[James]);
    }
    public static int fastest(String[] names,int[] times)
    {
        int res=0;
        for(int i=1;i<names.length;i++)
        {
            if(times[i]<times[res])
            {
                res=i;
            }
        }
        return res;
    }
    public static int SecondFastest(String[] names,int[] times)
    {
        int res=0;
        int goat=fastest(names,times);
        if(goat==0)res=1;
        for(int i=0;i< names.length;i++)
        {
            if(i!=goat && times[i]<times[res])
            {
                res=i;
            }
        }
        return res;
    }

}