import java.util.Arrays;

public class User {
    private String name,id;
    private boolean[] certs;
    //0 Exacto Blade, 1 Dowel Cutter, 2 File, 3 hammer/Mallet, 4 Hot Glue, Vinyl Cutter, 5 Hand Saw, 6 3D Printer, 7 Staple Gun, 8 Dremel, 9 Jigsaw, 10 Drill, 11 Soldering, 12 Sewing Machine, 13 Canibble, 14 Laser Cutter, 15 CNC, 16 Ladder
    private int hashcode;

    public User(String name, String id){
        this.name = name;
        this.id = id;
        this.hashcode = hash(id);
    }
    public User(String name, String id, int hashcode){
        this.name = name;
        this.id = id;
        this.hashcode = hashcode;
    }

    /**
     * Turns ID into index
     * @param id
     * @return
     */
    public static int hash(String id){
        char[] hash = id.toCharArray();
        int[] hashid = new int[hash.length];
        int num = 0;
        for(int i = 0; i < hash.length; i++){
            hashid[i] = hash[i];
        }
        for(int i = hashid.length; i > 0; i--){
            num += hashid[i]*Math.pow(10,i);
        }
        return num;
    }

    public void certify(int tool){ certs[tool] = true; }
    public void revoke(int tool){ certs[tool] = false; }

    public boolean check(int tool){ return certs[tool]; }

    public String certs(){
        return Arrays.toString(certs);
    }


}
