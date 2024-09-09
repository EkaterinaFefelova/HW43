package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Wheel implements Rotatable{
    public void rotate(){
        System.out.println("The wheel is rotating");
    };
}
