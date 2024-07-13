package net.javacrud.ems_banckend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EployeeDTO {
    private long id;
    private String firstName;
    private String lastName;
    private String email;
}
