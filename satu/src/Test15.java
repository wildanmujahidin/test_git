public class Test15 {
    public static void main(String[] args) {
        
        System.out.println(hitungKata("I Love You Too"));
    }

    /**
     * hitungKata
     */ 
    public static int hitungKata (String a){
        
        char[] cr= a.toCharArray();
        //System.out.println(cr);
        int sum=1;
        for(char n:cr){
            //System.out.println(n);
            char s= ' ';
            if (n== s){
                sum+=1;
            }
        }
        return sum;
    }
}
