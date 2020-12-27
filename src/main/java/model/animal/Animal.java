package model.animal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Animal {
    private int weight;
    private int length;
    private int width;
    private int height;
    private String mainColor;
    private int yearsOld;
    private boolean isFed;
    private boolean isHealthy;
}