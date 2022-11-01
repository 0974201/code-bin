using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HwDingetje2018
{
    class Program
    {
        static void Main(string[] args)
        {
            //Opdracht3();
            Opdracht6();
        }

        public static void Opdracht6()
        {
            //ik weet zeker dat ik al eens een keer eerder zoiets had moeten maken voor school
            //this is why you should keep the code you have written

            string input; //voor readline
            int aantal_personen;
            string naam;
            int leeftijd;
            var lijstje = new Dictionary <string, int>(); //dict aanroepen, key + value = naam , leeftijd

            //nvm dictionary is beter, waarom wou ik voor een arraylist gaan.
            //"van een groep mensen", hhhhh dat kan alles zijn

            Console.WriteLine("> hoeveel personen? "); //oke dn vragen we toch eerst hoeveel er zijn
            Console.Write("* "); //*
            input = Console.ReadLine(); //input inlezen

            while (!Int32.TryParse(input, out aantal_personen)) //kijken of er wel een cijfer is ingevoerd, dan convert naar int
            {
                Console.WriteLine("> geen getal ingevoerd!");
                input = Console.ReadLine();
            }

            for (int i = 0; i < aantal_personen; i++) //blijft vragen afhankelijk van hoeveel personen er zijn opgegeven
            {
                Console.WriteLine("> voer een naam in: ");
                Console.Write("* ");
                naam = Console.ReadLine();

                Console.WriteLine("> voer de leeftijd van " + naam + " in: ");
                Console.Write("* ");
                input = Console.ReadLine();

                while (!Int32.TryParse(input, out leeftijd)) //...copypasta
                {
                    Console.WriteLine("> geen getal ingevoerd!");
                    input = Console.ReadLine();
                }

                lijstje.Add(naam, leeftijd);
                //todo: error afhandeling. duplicate entries zorgt ervoor dat dit hartstikke doodgaat.
                //Console.WriteLine(">" + naam + ", " + leeftijd); //test
            }

            foreach (var inv in lijstje) //foreach omdat ik alleen gare posities in memory terug kreeg
            {
                //Console.WriteLine("Naam : {0}, Leeftijd: {1}", inv.Key, inv.Value); //test

                if (inv.Value > 18)
                {
                    Console.WriteLine("{0}, wel", inv.Key);
                }
                else
                {
                    Console.WriteLine("{0}, niet", inv.Key);
                }
            }

            //Console.ReadKey(); //omdat het irritant is dat de console elke keer quit als de programma done is.
        }
    }
}