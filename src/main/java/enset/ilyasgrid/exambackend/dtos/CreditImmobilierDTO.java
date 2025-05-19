package enset.ilyasgrid.exambackend.dtos;

import enset.ilyasgrid.exambackend.enums.TypeBien;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreditImmobilierDTO extends CreditDTO {
    private TypeBien typeBien;
}