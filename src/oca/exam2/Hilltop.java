package oca.exam2;

public class Hilltop {
    public static void main(String[] args) { //[eyra vafi draumur kara]
        String[] horses = new String[5]; // [null, null, null, null, null]
        horses[4] = null;
        for(int i = 0; i < horses.length; i++){
            if(i < args.length)
                horses[i] = args[i];
            System.out.print(horses[i].toUpperCase() + " ");
        }
    }
}
