public class towersOfHanoi {
    public static void towersOfHanoi(int n ,String src,String help,String dest){
        if(n==1){
            System.out.println("Transfer of disk 1 from"+src+"to"+dest);
            return;
        }
        towersOfHanoi(n-1,src,dest,help);
        System.out.println("Transfer of disk "+n+" from"+src+"to"+dest);
        towersOfHanoi(n-1,help, src,dest);
    }
    public static void main(String[] args) {
        int n=3;
        towersOfHanoi(n,"S","H","D");
    }
}
