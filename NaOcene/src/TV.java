public class TV {
    int channel;
    int volume;
    boolean on;
    public TV(int channel, int volume, boolean on){
        this.channel = channel;
        this.volume = volume;
        this.on = on;
    }
    public class Remote {
        public void changeUP(int x){
            if(x<21){
               x++;
            }
        }
        public void changeDOWN(int x){
            if(x>0){
                x--;
            }
        }
        public void changeVolume(int y){

        }
        public void PowerButton(boolean on){

        }

    }
    public static void main(String[] args){
        TV Tv1 = new TV(1,10,true);

    }
}

