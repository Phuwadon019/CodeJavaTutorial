public class work3 {
    public static void main(String[] args) {
        int n = 1;
        double x = 0;
        double s;
        do{
            s = 1.0 / (n * n);
            x = x + s;
            n++;
        } 
        while (s> 0.01);

        s = 1.0 / (n * n);
    
        while (s > 0.01) {
        x = x + s;
        n++;
        s = 1.0 / (n * n);
    }

        
    }
}
