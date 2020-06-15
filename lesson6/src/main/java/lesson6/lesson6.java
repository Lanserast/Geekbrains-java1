package lesson6;
/*Создать классы Собака, Лошадь, Птица и Кот с наследованием от класса Животное.
Животные могут выполнять действия: бежать, плыть и прыгать. В качестве параметра каждому методу передается величина, обозначающая или длину (для бега и плавания),
или высоту (для прыжков)
У каждого животного есть ограничения на действия:
бег: кот = 200 м., собака = 500 м., лошадь = 1500 м, птица = 5 м;
 плавание: кот и птица не умеет плавать,собака 10 м., лошадь 100 м.
  прыжок: кот = 2 м., собака 0.4 м., лошадь 3 м., птица 0.1 м.
При попытке выполнить одно из действий, оно должно сообщить результат: смогло или нет животное выполнить действие, например, dog.run(150); -> результат 'Пес пробежал!';
* Добавить подсчет созданных котов, собак и животных.
* Добавить животным разброс в ограничениях. То есть у одной собаки может быть ограничение на бег 400 м., у другой 600 м..*/

public class lesson6 {

    public static void main (String[] args){
        double distance;
        Horse horse = new Horse("Лошадь", "Сахарок", 1500, 100, 3);
 //       System.out.println(horse.getUid());
        Bird bird = new Bird("Птица", "Гена", 5, 0, 0.1);
        Cat cat = new Cat("Кот", "Тигра", 200, 0, 2);
        Dog dog = new Dog("Собака", "Барбос", 500, 10,0.4);
        Dog dog2 = new Dog("Собака", "Шарик", 400, 10,0.4);
        Dog dog3 = new Dog("Собака", "Острозуб", 600.1, 10,0.4);
        Animal animal;

        //System.out.println(animal.getType());

        //Тестируем лошадь.
        distance = 150;
        animal = horse;
        System.out.println("Тестируем лошадь");
        if (animal.Run(distance)){
            System.out.println("Лошадь " + animal.getName()+" пробежала " + distance + " метров"  );
        }
        else{
            System.out.println("Лошадь " + animal.getName()+" не пробежала " + distance + " метров"  );
        }
        distance = 500;

        if (animal.Run(distance)){
            System.out.println("Лошадь " + animal.getName()+" пробежала " + distance + " метров"  );
        }
        else{
            System.out.println("Лошадь " + animal.getName()+" не пробежала " + distance + " метров"  );
        }
        distance = 100000.50;

        if (animal.Run(distance)){
            System.out.println("Лошадь " + animal.getName()+" пробежала " + distance + " метров"  );
        }
        else{
            System.out.println("Лошадь " + animal.getName()+" не пробежала " + distance + " метров"  );
        }
        System.out.println("---------------------------");
        System.out.println("Тестируем кота");
        //Тестируем кота
        animal = cat;

        //бег
        distance = 40;
        if (animal.Run(distance)){
            System.out.println("Кот " + animal.getName()+" пробежал " + distance + " метров"  );
        }
        else{
            System.out.println("Кот " + animal.getName()+" не пробежал " + distance + " метров"  );
        }

        //плавание
        distance = 1;
        if (animal.Swim(distance)){
            System.out.println("Кот " + animal.getName()+" проплыл " + distance + " метров"  );
        }
        else{
            System.out.println("Кот " + animal.getName()+" не проплыл " + distance + " метров"  );
        }

        //прыжок
        distance = 1.5;
        if (animal.Jump(distance)){
            System.out.println("Кот " + animal.getName()+" прыгнул на " + distance + " метров"  );
        }
        else{
            System.out.println("Кот " + animal.getName()+" не смог прыгнуть на " + distance + " метров"  );
        }
        System.out.println("---------------------------");
        System.out.println("Тестируем собак");
        //тестируем собак
        for (distance = 400; distance<=700; distance+=100){
            animal = dog;
            System.out.println("Дистанция: " + distance);
            if (animal.Run(distance)){
                System.out.println("Собака " + animal.getName()+" пробежал " + distance + " метров"  );
            }
            else{
                System.out.println("Собака " + animal.getName()+" не пробежал " + distance + " метров"  );
            }
            animal = dog2;
            if (animal.Run(distance)){
                System.out.println("Собака " + animal.getName()+" пробежал " + distance + " метров"  );
            }
            else{
                System.out.println("Собака " + animal.getName()+" не пробежал " + distance + " метров"  );
            }
            animal = dog3;
            if (animal.Run(distance)){
                System.out.println("Собака " + animal.getName()+" пробежал " + distance + " метров"  );
            }
            else{
                System.out.println("Собака " + animal.getName()+" не пробежал " + distance + " метров"  );
            }
            System.out.println("---------------------------");
        }
        System.out.println("Кол-во животных равно "+ animal.getUid());
    }
}

