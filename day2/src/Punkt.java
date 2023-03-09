public class Punkt {
    int x,y;

    public Punkt(){
        this.x=0;
        this.y=0;
    }
    public Punkt(int x,int y){
        this.x=x;
        this.y=y;
    }
    public double WektorPunktow(int x, int y){
        return (Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2)));
    }
    public double WektorObiektow(Punkt punkt){
        return (Math.sqrt(Math.pow(this.x-punkt.x,2)+Math.pow(this.y-punkt.y,2)));
    }
    public static void main(String[] args){
        Punkt punkt1 = new Punkt(7,2);
        Punkt punkt2 = new Punkt(0, 1);
        System.out.println(punkt1.WektorPunktow(4,0));
        System.out.println(punkt1.WektorObiektow(punkt2));
    }

}
