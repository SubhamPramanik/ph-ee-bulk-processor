package org.mifos.processor.bulk.schema;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BeneficiaryDTO {
    private String payeeIdentity;
    private String paymentModality;
    private String financialAddress;
    private String bankingInstitutionCode;

}
