package Practice_Java.Interview_Questions_2;

import java.util.Scanner;

public class Config {

    private String text;
    private String new_text;
    private Scanner input;


    // Constructor
    public Config (String text )
    {
        setText(text);
        setNew_text("");
        input = new Scanner(System.in);

        System.out.println(" Chose your desired function :");
        System.out.println(" 1 : upperCase");
        System.out.println(" 2 : lowerCase");
        System.out.println(" 3 : getNumberUppercase");
        System.out.println(" 4 : getSpecialCharacters");
        System.out.println(" 5 : getAll");
        System.out.print(" Your Choice : ");

        byte choice = input.nextByte();

        switch (choice)
        {
            case 1 :
                upperCase();
                break;

            case 2 :
                lowerCase();
                break;

            case 3 :
                getNumbers();
                break;

            case 4 :
                getSpecialCharacters();
                break;

            case 5 :
                getAll();
                break;
        }

    }

    // Setters
    private void setText( String text ) { this.text = text; }
    private void setNew_text( String new_text ) { this.new_text = new_text; }

    // Getters
    private String getText() { return this.text ; }
    private String getNew_text() { return this.new_text ; }


    private void upperCase()
    {
        StringBuilder upperCase = new StringBuilder();

        for ( char character : getText().toCharArray() )
        {
            if ( Character.isUpperCase(character) )
            {
                upperCase.append(character);
            }

        }
        setNew_text( upperCase.toString() );
        print();

    }

    private void lowerCase()
    {
        StringBuilder lowerCase = new StringBuilder();

        for ( char character : getText().toCharArray() )
        {
            if ( Character.isLowerCase(character) )
            {
                lowerCase.append(character);
            }

        }
        setNew_text( lowerCase.toString() );
        print();

    }

    private void getNumbers()
    {
        StringBuilder digit = new StringBuilder();

        for ( char character : getText().toCharArray() )
        {
            if ( Character.isDigit(character) )
            {
                digit.append(character);
            }

        }
        setNew_text( digit.toString() );
        print();

    }

    private void getSpecialCharacters()
    {
        StringBuilder specialCharacter = new StringBuilder();

        for ( char character : getText().toCharArray() )
        {
            if ( !( Character.isLetterOrDigit(character) ) )
            {
                specialCharacter.append(character);
            }

        }
        setNew_text( specialCharacter.toString().trim() );
        print();

    }

    private void getAll ()
    {
        upperCase();
        lowerCase();
        getNumbers();
        getSpecialCharacters();
    }

    private void print ()
    {
        System.out.println( getNew_text() );
    }

}
