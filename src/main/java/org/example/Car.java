package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Car implements Movable{
    public void move (){
        System.out.println("The car is moving");
    };
}
