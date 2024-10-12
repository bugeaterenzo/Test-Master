package Practice_Java.Interview_Questions;

public class Config {

        // Variables  :

        public String text;
        public String reverse_text;
        private StringBuilder builder;
        private char[] characters;


    // Constructor

    public Config( String text )
    {
        setText(text);
        setReversed_Text("");
        builder = new StringBuilder();
        setCharacters( getText().toCharArray() ) ;
        reverse_Builder();
        reverse();
    }



    // Setters

    private void setText(String text) { this.text = text; }

    private void setReversed_Text(String reverse_text) { this.reverse_text = reverse_text; }

    private void setCharacters(char[] characters ) { this.characters = characters; }



    // Getters

    public String getText() { return this.text; }

    public String getReversed_Text() { return this.reverse_text; }

    public StringBuilder getBuilder() { return this.builder; }

    public char[] getCharacters() { return this.characters; }

   public String reverse()
   {
       for( int i = getText().length()-1; i >= 0; i-- )
       {
           setReversed_Text( getReversed_Text() + getText().charAt(i) ) ;
       }
       return getReversed_Text() ;
   }

   public void print_Reverse()
   {
       System.out.println( "Original Version : " + getText() );
       System.out.println( "Reversed Version : " + getReversed_Text() );
   }

    public String reverse_Builder ( )
    {
        for ( int index = getCharacters().length-1; index >= 0; index--)
        {
            getBuilder().append(getCharacters()[index]);
        }
        return  getBuilder().toString() ;
    }

    public void print_reverse_Builder()
    {
        System.out.println( "Original Version : " + getText() );
        System.out.println( "Reversed Version : " + getBuilder() );
    }






}
