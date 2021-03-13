package oda.edu.module1;/*
  @author   Denys Ovdiienko
  @project   oda.edu
  @class  HarryPotter
  @version  1.0.0 
  @since 10.03.2021 - 19.42
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class HarryPotter {

    public static void main(String[] args) throws IOException {
        String text = new String(Files.readAllBytes(Paths.get("D:\\Java\\harry.txt"))); //read from txt file
        text = text.replaceAll("[^A-Za-z ']", ""); //delete trash
        String[] words = text.split(" +");

        String stringOfDistincts = "";

        for (int i = 0; i < words.length; i++) {
            if (!stringOfDistincts.contains(words[i])) {
                stringOfDistincts += words[i] + " ";
            }
        }

        String[] distincts = stringOfDistincts.split(" ");
        Arrays.sort(distincts); //sorting by
        System.out.println("Number of unique words : " + distincts.length);
        System.out.println("Words sorted by alphabet : ");
        for (int i = 0; i < 100; i++) {
            System.out.println(distincts[i]);

        }
    }
    /*Number of unique words : 6000
Words sorted by alphabet :
'Alohomora
'Atta
'Cause
'Course
'Dumbledore
'Harry's
'Jordan
'Mr
'NMat
'Oh
'Pig
'Quidditch'
'Scuse
'Snot
'Up'
'Yes
'You
'YouKnowWho'
'cause
'cept
'f'
'gar'
'hocus
'm'
'please'
's'
'smatter
'there's
'til
'to
'undred
'wand
AAAAAAAAAARGH
ALBUS
ALL
ALLEY
ALLOWED
AM
AND
ANYTHING
AT
Aaah
Aargh
Abbott
Abou'
About
Absolutely
According
Adalbert
Add
Adrian
Africa
African
After
Against
Ages
Agrippa
Ah
Aha
Ahead
Ahem
Ahern
Alas
Alberic
Albus
Algie
Alicia
All
Alley
Although
Always
Am
An'
And
Angelina
Another
AntiCheating
AntiDark
Anyone
Anythin'
Anything
Anyway
Apothecary
Are
Aren't
Argus
Around
Arsenius
Arts
As
Asked
Astronomy
At
Ate
August
Aunt
Auntie
BC
BED
BEHIND
*/
}



