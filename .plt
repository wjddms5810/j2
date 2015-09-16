
@startuml
class Client
interface Flyable{
    +fly()
}
interface Quackable{
    +quack()
} 
class Duck{
    +swin()
    +display()
}

class MallardDuck
class RedheadDuck 
class RubbberDuck

Duck <|-- MallardDuck
Duck <|-- RedheadDuck 
Duck <|-- RubbberDuck
Client -right->Duck
Duck -right-> Flyable
Duck -right-> Quackable
Flyable <|.. FlywithWings
Flyable <|.. FlyNoWay
Quackable <|.. Qauck
@enduml