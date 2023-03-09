public class Kwadrat {
    int bok;
    public Kwadrat(int bok){
        this.bok = bok;
    }
    public int obliczenia(){
        return(this.bok*4);
    }
    public static void main(String[] args){
        Kwadrat Romb = new Kwadrat(5);
        System.out.println(Romb.obliczenia());
    }
}
