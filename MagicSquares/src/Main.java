import java.io.*;

public class Main {
    public static int read(FileInputStream inputStream)
    {
        int x=0,f=1;
        try{
            int ch=inputStream.read();
            if(ch==-1)return -1;
            while(ch<'0'||ch>'9'){if(ch=='-')f=-1;ch=inputStream.read();if(ch==-1)return -x*f;}
            while(ch>='0'&&ch<='9'){x=x*10+ch-'0';ch=inputStream.read();if(ch==-1)return -x*f;}
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(x+" "+f);
        return x*f;
    }
    public static int abs(int x)
    {
        if(x>0)return x;
        return -x;
    }
    public static void main(String[] args) {
        int [][] a=new int[200000][20];
        int nowx=0,nowy=0,len=0;
        FileInputStream inputStream = null;
        try {
            File file = new File("D:\\text\\MIT6.092\\MIT-6.092-Introduction-To-Programming-In-Java\\MagicSquares\\src\\Luna.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String content;
            while ((content = reader.readLine()) != null) {
//                System.out.println(nowx+" "+nowy+" "+(content));
                char[] ch = content.toCharArray();
                int now = 0;
                for (int i = 0; i < ch.length; i++) {
                    System.out.println(nowx + " " + i + " " + ch[i] + " " + now);
                    if ((ch[i] < '0' || ch[i] > '9') && (i == 0 || (ch[i - 1] >= '0' && ch[i - 1] <= '9'))) {
                        a[nowx][nowy] = now;
                        nowy++;
                        now = 0;
                    } else if (ch[i] >= '0' && ch[i] <= '9') {
                        now = now * 10 + ch[i] - '0';
                    }
                }
                a[nowx][nowy]=now;
                nowx++;
                len=nowy;
                nowy = 0;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        int ff=-1;
        for(int i=0;i<=len;i++)
        {
            int res=0;
            for(int j=0;j<=len;j++)
            {
                res+=a[i][j];
//                System.out.print(a[i][j]+" ");
            }
//            System.out.println(res);
            if(i==0)ff=res;
            else
            {
                if(ff!=res)
                {
                    System.out.println("NO!!!!!!!!!!!!");
                    return;
                }
            }
        }
        System.out.println("YES!!!!!!!!!!!!!!");
    }
}