
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws java.io.IOException {
        int n = 15;
        Vehicle[] mas = new Vehicle[n];
        AbstractVehicleFactory vf = new VehicleFactory();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = vf.RandVehicle();
        }

        int number;
        int number_root = 1;
        Scanner scan = new Scanner(System.in);

        while (number_root != 0) {
            System.out.println("1 - Вивести на екран координати транспортного засобу");
            System.out.println("2 - Вивести на екран ціну транспортного засобу");
            System.out.println("3 - Вивести на екран швидкість транспортного засобу");
            System.out.println("4 - Вивести на екран рік випуску транспортного засобу");
            System.out.println("5 - Задати координати транспортного засобу");
            System.out.println("6 - Задати ціну транспортного засобу");
            System.out.println("7 - Задати швидкість транспортного засобу");
            System.out.println("8 - Задати рік випуску транспортного засобу");
            System.out.println("9 - Вивести на екран координати всіх транспортних засобів");
            System.out.println("10 - Вивести на екран додаткові поля для літака");
            System.out.println("11 - Вивести на екран додаткові поля для корабля");
            System.out.println("12 - Задати додаткові поля для літака");
            System.out.println("13 - Задати додаткові поля для корабля");
            System.out.println("14 - Знайти найдорожчий транспортний засіб");
            System.out.println("15 - Знайти транспортний засіб: рік випуску 2000-2005, швидкість більше 150 км/год, найменша вартість");
            System.out.println("16 - Масив Car не старше 5 років");
            System.out.println("17 - Масив Ship з відсортованою ціною за спаданням");
            System.out.println("0 - Вихід");

            number_root = scan.nextInt();

            switch (number_root) {
                case 1:
                    System.out.println("\nВведіть номер транспортного засобу");
                    number = scan.nextInt();
                    mas[number].display_coord();
                    System.out.println("Press Enter");
                    System.in.read();
                    break;
                case 2:
                    System.out.println("\nВведіть номер транспортного засобу");
                    number = scan.nextInt();
                    mas[number].display_price();
                    System.out.println("Press Enter");
                    System.in.read();
                    break;
                case 3:
                    System.out.println("\nВведіть номер транспортного засобу");
                    number = scan.nextInt();
                    mas[number].display_speed();
                    System.out.println("Press Enter");
                    System.in.read();
                    break;
                case 4:
                    System.out.println("\nВведіть номер транспортного засобу");
                    number = scan.nextInt();
                    mas[number].display_year();
                    System.out.println("Press Enter");
                    System.in.read();
                    break;
                case 5:
                    System.out.println("\nВведіть номер транспортного засобу");
                    number = scan.nextInt();
                    System.out.println("\nВведіть географічну широту транспортного засобу");
                    double x = scan.nextDouble();
                    System.out.println("\nВведіть географічну довготу транспортного засобу");
                    double y = scan.nextDouble();
                    mas[number].setLatitude(x);
                    mas[number].setLongitude(y);
                    System.out.println("Press Enter");
                    System.in.read();
                    break;
                case 6:
                    System.out.println("\nВведіть номер транспортного засобу");
                    number = scan.nextInt();
                    System.out.println("\nВведіть ціну транспортного засобу");
                    mas[number].setPrice(scan.nextDouble());
                    System.out.println("Press Enter");
                    System.in.read();
                    break;
                case 7:
                    System.out.println("\nВведіть номер транспортного засобу");
                    number = scan.nextInt();
                    System.out.println("\nВведіть швидкість транспортного засобу");
                    mas[number].setSpeed(scan.nextDouble());
                    System.out.println("Press Enter");
                    System.in.read();
                    break;
                case 8:
                    System.out.println("\nВведіть номер транспортного засобу");
                    number = scan.nextInt();
                    System.out.println("\nВведіть рік випуску транспортного засобу");
                    mas[number].setYear(scan.nextInt());
                    System.out.println("Press Enter");
                    System.in.read();
                    break;
                case 9:
                    for (int i = 0; i < mas.length; i++)
                        mas[i].display_coord();
                    System.out.println("Press Enter");
                    System.in.read();
                    break;
                case 10:
                    System.out.println("\nВведіть номер транспортного засобу");
                    number = scan.nextInt();
                    if(!(mas[number] instanceof Plane))
                        System.out.println("\nЦе не літак!");
                    else {
                        double h = ((Plane)mas[number]).getHeight();
                        int k = ((Plane)mas[number]).getPassengers();
                        System.out.printf("Висота: %.3f\n", h);
                        System.out.printf("Кількість пасажирів: %d\n", k);
                        System.out.println("Press Enter");
                        System.in.read();
                    }
                    break;
                case 11:
                    System.out.println("\nВведіть номер транспортного засобу");
                    number = scan.nextInt();
                    if(!(mas[number] instanceof Ship))
                        System.out.println("\nЦе не корабель!");
                    else {
                        String str = ((Ship)mas[number]).getPort();
                        int k = ((Ship)mas[number]).getPassengers();
                        System.out.printf("Кількість пасажирів: %d\n", k);
                        System.out.printf("Порт: ", str, "\n");
                        System.out.println("Press Enter");
                        System.in.read();
                    }
                    break;
                case 12:
                    System.out.println("\nВведіть номер транспортного засобу");
                    number = scan.nextInt();
                    if(!(mas[number] instanceof Plane))
                        System.out.println("\nЦе не літак!");
                    else {
                        System.out.println("\nВведіть висоту");
                        ((Plane)mas[number]).setHeight(scan.nextDouble());
                        System.out.println("\nВведіть кількість пасажирів");
                        ((Plane)mas[number]).setHeight(scan.nextInt());
                    }
                    System.out.println("Press Enter");
                    System.in.read();
                    break;
                case 13:
                    System.out.println("\nВведіть номер транспортного засобу");
                    number = scan.nextInt();
                    if(!(mas[number] instanceof Ship))
                        System.out.println("\nЦе не корабель!");
                    else {
                        System.out.println("\nВведіть порт");
                        ((Ship)mas[number]).setPort(scan.next());
                        System.out.println("\nВведіть кількість пасажирів");
                        ((Ship)mas[number]).setPassengers(scan.nextInt());
                    }
                    System.out.println("Press Enter");
                    System.in.read();
                    break;
                case 14:
                    for (int i = 0; i < mas.length; i++)
                        mas[i].display_price();
                    System.out.println("\nТранспортний засіб з найвищою ціною");
                    Max_Price(mas).display_price();
                    System.out.println("Press Enter");
                    System.in.read();
                    break;
                case 15:
                    for (int i = 0; i < mas.length; i++) {
                        mas[i].display_price();
                        mas[i].display_year();
                        mas[i].display_speed();
                    }
                    System.out.println("\nТранспортний засіб: рік випуску 2000-2005, швидкість більше 150 км/год, найменша вартість");
                    Vehicle temp = Universal(mas);
                    if (temp == null)
                        System.out.println("Такого транспортного засобу не існує");
                    else {
                        temp.display_price();
                        temp.display_year();
                        temp.display_speed();
                    }
                    System.out.println("Press Enter");
                    System.in.read();
                    break;
                case 16:
                    for (int i = 0; i < mas.length; i++) {
                        mas[i].display_price();
                        mas[i].display_year();
                        mas[i].display_speed();
                    }
                    System.out.println("\nМасив Car не старше 5 років");
                    Car[] temp_car = Get_Car(mas);
                    if (temp_car == null)
                        System.out.println("Такого транспортного засобу не існує");
                    else {
                        for (int i = 0; i < temp_car.length; i++) {
                            temp_car[i].display_price();
                            temp_car[i].display_year();
                            temp_car[i].display_speed();
                        }
                    }
                    System.out.println("Press Enter");
                    System.in.read();
                    break;
                case 17:
                    for (int i = 0; i < mas.length; i++) {
                        mas[i].display_price();
                        mas[i].display_year();
                        mas[i].display_speed();
                    }
                    System.out.println("\nВідсортований масив Ship не старше 5 років");
                    Ship[] temp_ship = Get_Ship(mas);
                    if (temp_ship == null)
                        System.out.println("Такого транспортного засобу не існує");
                    else {
                        for (int i = 0; i < temp_ship.length; i++) {
                            temp_ship[i].display_price();
                            temp_ship[i].display_year();
                            temp_ship[i].display_speed();
                        }
                    }
                    System.out.println("Press Enter");
                    System.in.read();
                    break;

                    default:
                        break;
            }
        }
    }


    public static Vehicle Max_Price(Vehicle[] mas){
        int imax = 0;
        for (int i = 1; i < mas.length; i++) {
            if (mas[i].getPrice() > mas[imax].getPrice())
                imax = i;
        }
        return mas[imax];
    }

    public static Vehicle Universal(Vehicle[] mas){
        int imin = 0;
        Boolean fl = false;
        if (mas[imin].getYear() > 1999 && mas[imin].getYear() < 2006 && mas[imin].getSpeed() > 150)
            fl = true;
        for (int i = 1; i < mas.length; i++) {
            if (mas[i].getYear() > 1999 && mas[i].getYear() < 2006 && mas[i].getSpeed() > 150 && mas[i].getPrice() < mas[imin].getPrice()) {
                imin = i;
                fl = true;
            }
        }
        if (fl)
            return mas[imin];
        else
            return null;
    }

    public static Car[] Get_Car(Vehicle[] mas){
        int k = 0;
        for (int i = 0; i < mas.length; i++)
            if (mas[i] instanceof Car && mas[i].getYear() > 2013)
                k++;

        if (k == 0)
            return null;
        else {
            Car[] temp = new Car[k];
            k = 0;
            for (int i = 0; i < mas.length; i++)
                if (mas[i] instanceof Car && mas[i].getYear() > 2013) {
                    temp[k] = (Car)mas[i];
                    k++;
                }
            return temp;
        }
    }


    public static Ship[] Get_Ship(Vehicle[] mas){
        int k = 0;
        for (int i = 0; i < mas.length; i++)
            if (mas[i] instanceof Ship && mas[i].getYear() > 2013)
                k++;

        if (k == 0)
            return null;
        else {
            Ship[] temp = new Ship[k];
            k = 0;
            for (int i = 0; i < mas.length; i++)
                if (mas[i] instanceof Ship && mas[i].getYear() > 2013) {
                    temp[k] = (Ship)mas[i];
                    k++;
                }

            return Sort(temp);
        }
    }

    public static Ship[] Sort(Ship[] vector)
    {
        int imin;
        Ship temp;
        for(int i = 0; i < vector.length - 1; i++)
        {
            imin = i;
            for (int j = i + 1; j < vector.length; j++)
            {
                if (vector[j].getPrice() > vector[imin].getPrice())
                    imin = j;
            }

            temp = vector[imin];
            vector[imin] = vector[i];
            vector[i] = temp;
        }

        return vector;
    }




}

