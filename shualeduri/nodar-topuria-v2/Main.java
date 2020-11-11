package Main;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

@Slf4j
public class Main {
    public static void main(String[] args){
        File f = new File("D:/BTU_DOCUMENT");
        String text = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("შემოიტანე საძიებო სიტყვა: ");
        System.out.print("გასაჩერებლად დაწერე Q");      
        while(true)
        {
          text = scanner.nextLine();
          if(text=="Q"){break;}
          log.info("მოსაძებნი სიტყვა: ",text);
          System.out.print("საძიებო სიტყვა: "+text);
          FilenameFilter filter = new FilenameFilter() {
              @Override
              public boolean accept(File f, String name) {
                  return name.endsWith(text);
              }
          };
          if(f.exists() && f.isDirectory())
          {
            File arr[] = f.listFiles();
            System.out.println("ფაილები ფოლდერიდან: " + f);
            RecursiveSearch(arr,0,0);
          }

        }
       
    }

    public static void RecursiveSearch(File[] arr,int index,int level)
    {

        if(index == arr.length)
            return;

        for (int i = 0; i < level; i++)
            System.out.print("\t");


        if(arr[index].isFile()) {
            System.out.println("მოიძებნა: "+arr[index].getName());
            log.info("მოიძებნა: ",arr[index].getName());
        }
      
        RecursiveSearch(arr,++index, level);
    }
}
