package com.google.complaint.runner;

import java.time.LocalDate;
import java.util.Scanner;

import com.google.complaint.dto.ComplaintDto;
import com.google.complaint.repository.ComplaintRepository;
import com.google.complaint.repository.ComplaintRepositoryImplimentation;
import com.google.complaint.service.ComplaintService;
import com.google.complaint.service.ComplaintServiceImplimentation;

import lombok.AllArgsConstructor;
@AllArgsConstructor
public class ComplaintRunner {

	public static void main(String[] args) {
		System.out.println("Enter the Choice below");
		
		System.out.println("Enter '1' to save the ComplaintDto");
		System.out.println("Enter '2' to Read ComplaintDto");
		System.out.println("Enter '3' to update");
		System.out.println("Enter '4' to delete");
		
		Scanner scanner= new Scanner(System.in);
		int choice=scanner.nextInt();
		
		ComplaintDto dto=new ComplaintDto();
		dto.setComplaintId(1);
		dto.setComplainantName("Shree");
		dto.setComplainantNum(7654536709l);
		dto.setComplaintDate(LocalDate.of(2024, 12, 12));
		dto.setResolvedDate(LocalDate.of(2024, 12, 25));
		
		
		ComplaintService service=new ComplaintServiceImplimentation(new ComplaintRepositoryImplimentation());
		
		while(choice<=4) {
			switch(choice) {
			case 1:
				String result=service.validate(dto);
				System.out.println(result);
				break;
				
			case 2:
				System.out.println(service.getAll());
				break;
			case 3:
				ComplaintDto dto1=new ComplaintDto();
				dto1.setComplaintId(11);
			    dto1.setComplainantName("Radha");
			    dto1.setComplainantNum(765356782l);
			    dto1.setComplaintDate(LocalDate.of(2023, 5, 4));
			    dto1.setResolvedDate(LocalDate.of(2025, 7, 4));
				String update =service.updateById(1, dto1);
				System.out.println(update);
				
				System.out.println(service.getAll());
				break;
			case 4:
				String delete=service.deleteById(11, dto);
				System.out.println(delete);
				System.out.println(service.getAll());
				break;
				
				default:
				System.out.println("Enter proper values");
				}
			choice=scanner.nextInt();
		}

	}

}
