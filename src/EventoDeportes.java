package ExamenFinal.SistemaDeportes;

import java.util.Scanner;

public class EventoDeportes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Registro de eventos
        System.out.println();
        System.out.println("=====DISTEMA DE GESTION DE EVENTOS DEPORTIVOS=====");
        System.out.println("please enter the amount of events that will carry out :  ");
        byte numEvents=scanner.nextByte();
        scanner.nextLine();
        //EVENTS LOG
        String [] eventNames = new String[numEvents];
        //aqui solo se permiten 3 tipos carrera natacion o ciclismo
        String[] eventType= new String[numEvents];
        String[] eventDate = new String[numEvents];
        int [] maxParticipant= new int[numEvents];

        EnterNameEvents(eventNames, scanner);
        EnterEventType(eventType, scanner, eventNames);
        EnterEventDate(eventDate, scanner, eventNames);
        for (String i : eventDate) {
            System.out.print(" "+ i);
        }
    }

    public static void EnterNameEvents(String[] eventNames, Scanner scanner){
        System.out.println(" enter events name and follow the next order:");
        for (int i = 0; i < eventNames.length; i++) {
            System.out.println(" event number "+(i+1)+": ");
            eventNames[i]=scanner.nextLine();
        }
        System.out.println();
    }

    public static void EnterEventType(String[] eventType,Scanner scanner,String [] eventNames){
        System.out.println("enter events type on the next order :");
        for (int i = 0; i < eventType.length; i++) {
            System.out.println(eventNames[i]+" : ");
            eventType[i]=scanner.nextLine();
        }
        System.out.println();
    }

     public static void EnterEventDate(String[] eventDate,Scanner scanner,String [] eventNames){
        System.out.println("enter the date for each event:");
        for (int i = 0; i < eventDate.length; i++) {
            System.out.println("- "+eventNames[i]+" : ");
            System.out.println("day:");
            String day=scanner.nextLine();
            System.out.println("month:");
            String month=scanner.nextLine();
            System.out.println("year:");
            String year=scanner.nextLine();
            eventDate[i]=day+"/"+month+"/"+year;
        }
        System.out.println();
    }

}
