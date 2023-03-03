package world;

import java.io.*;
//import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;
//import java.util.stream.IntStream;

public class World {

    public static void main(String[] args) throws FileNotFoundException {
        //int i = 0;
        //Country countryArray[];
        List<Country> countriesList = new ArrayList<Country>(Arrays.asList(
        new Country("A11","Australia","Asia",486.6,96.3,11,1000000),
        new Country("B12","Brazil","South America",286.6,20.3,12,10000),
        new Country("C13","Canada","North America",386.6,196.3,13,200000),
        new Country("D14","Denmark","Europe",86.6,36.3,14,400000),
        new Country("E15","Egypt","Africa",986.6,56.3,15,300000),
        new Country("F16","Finland","Europe",80.6,11.3,16,90000)));
        Comparator<? super Integer> comparator = null;
        
       // List<Country> africanCountries = new ArrayList<>();
        
        Optional<Integer> hieghstPopulate;
        hieghstPopulate = countriesList.stream()
                .map(Country::getPopulation)
                .max(comparator);
                
        
        
        System.out.println(hieghstPopulate);
//        for(Country d: countriesList)
//        {
//            if(d.getContinent().equals("Africa"))
//            {
//                africanCountries.add(d);
//            }
//        }
        
        //System.out.println(africanCountries.get(0).getName());
        
        //countriesList.size();
        //System.out.println(countriesList.size());
        //IntStream.of(countriesList).forEach(value ->System.out.printf("%d ", value));

        //countriesList = Arrays.asList(args)
//        Country c = new Country("abc","Koko","Africa",486.6,96.3,10,100000);
//        Scanner srcFile = new Scanner(new File("D:\\ITI_Data\\Java\\Labs\\Lab5\\Countries.csv"));
       
        //srcFile.useDelimiter(",");
        
//        while (srcFile.hasNext())  //returns a boolean value  
//        {
//            srcFile.useDelimiter(",");
//            
//            c.setCode(srcFile.next());
//            System.out.println(c.getCode());
//            
//            c.setName(srcFile.next());
//            System.out.println(c.getName());
//            
//            c.setContinent(srcFile.next());
//            System.out.println(c.getContinent());
//            
//            c.setSurfaceArea(srcFile.nextDouble());
//            System.out.println(c.getSurfaceArea());
//            
//            c.setPopulation(srcFile.nextInt());
//            System.out.println(c.getPopulation());
//            
//            c.setGnp(srcFile.nextDouble());
//            System.out.println(c.getGnp());
//            
//            c.setCapital(srcFile.nextInt());
//            
//            System.out.println(c.getCapital());
//           
//            countriesList.add(i,c);
//            i++;
//            //System.out.print(srcFile.hasNextLine());  //find and returns the next complete token from this scanner  
//        }
        
        //countriesList.get(0).prindData();
        
//        System.out.println(countriesList.get(1).getCode());
        
        //String x = srcFile.next();
        //c.setCode(x);
        
        //System.out.println(c.getCode());
        
        //countriesList.add(0, c);
        
        //System.out.println(countriesList.get(0).getCode());
        //srcFile.useDelimiter(",");   //sets the delimiter pattern
        //c.prindData();
        //System.out.println(c);
        //countriesList.set(0, c);
        //System.out.println(countriesList);
        
        //srcFile.close();  //closes the scanner  
    }
    
}
