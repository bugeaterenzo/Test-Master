package Practice_Java.Interview_Questions_3;


import java.util.LinkedHashMap;
import java.util.Map;

public class Config {

    private String[] names;
    private String target;
    private boolean found_target;
    // private Map<Character,Integer> name_map;


    public Config ( String[] names , String target )
    {
        setNames(names);
        setTarget(target);
        getAddress();
        getCharCount();
    }

    // Setters

    private void setNames ( String[] names ) { this.names = names; }
    private void setTarget(String target) { this.target = target; }
    private void setFound_target(boolean found_target) { this.found_target = found_target; }




    // getters
    private String[]  getNames ( ) { return this.names ;}
    private String getTarget( ) { return this.target; }
    private boolean getFound_target() { return this.found_target; }
    // public Map<Character, Integer> getNameMap() { return name_map; }



    private void getAddress()
    {
        setFound_target(false);
        int cout_of_name_1 = 0;

        for ( int index = 0; index < getNames().length; index++)
        {
            if ( getTarget( ).trim().equals(getNames()[index]) )
            {
                cout_of_name_1++;
                setFound_target( true );
            }


        }

        int cout_of_name_2 = 0;

        if ( getFound_target() ) {

            System.out.print(" [ ");
            for (int index = 0; index < getNames().length; index++) {
                if (getTarget().trim().equals(getNames()[index])) {
                    cout_of_name_2++;

                    if (cout_of_name_2 < cout_of_name_1) {
                        System.out.print(index + " , ");
                    } else {
                        System.out.print(index);
                    }
                }

            }
            System.out.print(" ] ");
        }
        else
        {
            System.out.print(" The given object " + getTarget() + " dose not exist in the given array list...!");
        }
    }

    private void getCharCount()
    {
        Map<Character, Integer> name_map = new LinkedHashMap<>();

        for ( int index = 0; index < getTarget().length(); index++ )
        {
            char character = Character.toLowerCase( getTarget().charAt(index) );

            if (name_map.containsKey(character))
            {
                name_map.put(character, name_map.get(character) + 1); //  increment the value by 1 to modify it for each occurrence
            } else
            {
                name_map.put(character, 1 ); // initialize by 1
            }
        }
        System.out.print("  " + name_map);
    }


}
