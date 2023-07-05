package com.taketicket.documentos.models.dtos.places;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UpdatePlaceDTO {
	
	@NotBlank(message = "Warn! place code  is required")
	private String code;
	
	@NotBlank(message = "Warn! place name is required")
	private String name;
}
