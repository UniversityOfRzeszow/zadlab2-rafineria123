package pl.edu.ur.main;

/**
 *
 * @author marcin
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 3, 4, 6, 7
        
        Scanner zad;
        zad=new Scanner(System.in);
        System.out.println("Podaj numer zadania: ");        
        int zadanie=zad.nextInt();
        switch(zadanie){
            case 3: 
                double[] tablica1 = new double[10];
                //wprowadzanie liczb
                for(int i=0;i<10;i++){
                    System.out.println("Podaj "+(i+1)+" liczbe rzeczywista: ");
                    tablica1[i]=zad.nextDouble();
                    
            
                }
                do{
                    System.out.println("Co chcesz wyświetlić?:");
                    System.out.println("1. Tablice od pierwszego do ostatniego indeksu");
                    System.out.println("2. Tablicy od ostatniego do pierwszego indeksu");
                    System.out.println("3. Elementy o parzystych indeksach");
                    System.out.println("4. Elementy o nieparzystych indeksach");
                    System.out.println("5. Zakończ program");
                    zadanie=zad.nextInt();
                
                    if(zadanie==1){
                        //od pierwszego do ostatniego
                        for(int i=0;i<10;i++){
                            System.out.println("tablica["+i+"]= "+tablica1[i]);
                        }
                    }
                    else if(zadanie==2){
                        //od ostatniego do pierwszego
                        for(int i=9;i>=0;i--){
                            System.out.println("tablica["+i+"]= "+tablica1[i]);
                        }
                    }
                    else if(zadanie==3){
                        //parzyste indeksy
                        for(int i=0;i<10;i++){
                            if(i%2==0){
                            System.out.println("tablica["+i+"]= "+tablica1[i]);
                            }
                        }
                    }
                    else if(zadanie==4){
                        //nieparzyste indeksy
                        for(int i=0;i<10;i++){
                            if(i%2!=0){
                            System.out.println("tablica["+i+"]= "+tablica1[i]);
                            }
                        }
                    }
                    else if(zadanie==5){
                        break;
                    }
                        
                }
                while(true);
                
                
                
                break;
            case 4:
                double[] tablica2 = new double[10];
                //wprowadzanie liczb
                for(int i=0;i<10;i++){
                    System.out.println("Podaj "+(i+1)+" liczbe rzeczywista: ");
                    tablica2[i]=zad.nextDouble();
                    
            
                }
                do{
                    System.out.println("Co chcesz wyświetlic?:");
                    System.out.println("1. Sume elementow tablicy");
                    System.out.println("2. Iloczyn elementow tablicy");
                    System.out.println("3. Wartosc srednia");
                    System.out.println("4. Wartosc minimalna");
                    System.out.println("5. Wartosc maksymalna");                    
                    System.out.println("6. Zakoncz program");
                    zadanie=zad.nextInt();
                
                    if(zadanie==1){
                        double suma=0;
                        for(int i=0;i<10;i++){
                            suma=suma+tablica2[i];
                        }
                        System.out.println("Suma wynosi: "+suma);
                        
                        
                    }
                    else if(zadanie==2){
                       double iloczyn=1;
                       for(int i=0;i<10;i++){
                            iloczyn=iloczyn*tablica2[i];
                       }
                       System.out.println("Iloczyn wynosi: "+iloczyn);
                        
                    }
                    else if(zadanie==3){
                        double srednia=0;
                        for(int i=0;i<10;i++){
                            srednia=srednia+tablica2[i];
                       }
                       System.out.println("Srednia wynosi: "+(srednia/10));

                    }
                    else if(zadanie==4){
                        double min=tablica2[0];
                        for(int i=0;i<10;i++){
                            if(min>tablica2[i]){
                                min=tablica2[i];
                            }
                        }
                        System.out.println("Minimalna wartość wynosi: "+min);
                        

                    }
                    else if(zadanie==5){
                        double max=tablica2[0];
                        for(int i=0;i<10;i++){
                            if(max<tablica2[i]){
                                max=tablica2[i];
                            }
                        }
                        System.out.println("Maksymalna wartosc wynosi: "+max);
                        
                        
                    }
                    else if(zadanie==6){
                        break;
                        
                    }
                        
                }
                while(true);
                
                
                
                break;
            case 5:
                System.out.println("Liczby od 20-0, z wylaczeniem liczb {2,6,9,15,19}");
                for(int i=20;i>=0;i--){
                    if(i==2||i==6||i==9||i==15||i==19){
                        continue;
                    }
                    System.out.println(i);
                    
                }
                break;
            case 6:
                int z;
                while(true){
                    System.out.println("Podaj liczbe całkowita: ");
                    z=zad.nextInt();
                    if(z<0){
                        break;
                    }
                }
                
                
                break;
            case 7:
                System.out.println("Ile liczb chcesz podac?: ");
                int liczby=zad.nextInt();
                double[] tablica3 = new double[liczby];
                for(int i=0;i<liczby;i++){
                    System.out.println("Podaj "+(i+1)+" liczbe: ");
                    tablica3[i]=zad.nextDouble();
                }
                int zamiana=1;
                double podstawka;
                while(zamiana>0){
                    zamiana=0;
                    for(int i=0;i<liczby-1;i++){
                        if(tablica3[i]>tablica3[i+1]){
                            podstawka=tablica3[i+1];
                            tablica3[i+1]=tablica3[i];
                            tablica3[i]=podstawka;
                            zamiana++;
                                
                        }
                        
                    }
                }
                for(int i=0;i<liczby;i++){
                    System.out.println(tablica3[i]+" ");
                }
                
                break;
            default:
                break;
                
                
                
        }
        
        
        
     
        
        
    }
    
            
    
}
