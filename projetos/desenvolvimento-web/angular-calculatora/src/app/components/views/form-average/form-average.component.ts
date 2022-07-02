import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-form-average',
  templateUrl: './form-average.component.html',
  styleUrls: ['./form-average.component.css']
})
export class FormAverageComponent implements OnInit {

	nota: string = '';
	ac1: number = 0.0;
	ac2: number = 0.0;
	ag: number = 0.0;
	af: number = 0.0;
	isCalculate: boolean = false;
	isAproved: boolean = false;


  constructor() { }

  ngOnInit(): void {
  }

	calcularNota(): void {
		let result = (this.ac1 * 0.15) + (this.ac2 * 0.30) + (this.ag * 0.10) + (this.af * 0.45);
		if(!result || result <= 0) {
				this.nota = "Nota inválida";
				this.isCalculate = false;
				return;
		}
		this.nota = result.toString();
		this.verify(result);
	}

	limpar(): void {
		this.ac1 = 0.0;
		this.ac2 = 0.0;
		this.ag = 0.0;
		this.af = 0.0;
		this.nota = '';
		this.isAproved = false;
		this.isCalculate = false;
	}

	verify(media: number): void {
		if(media >= 5) this.isAproved = true;
		this.isCalculate = true;
		return;
	}

}
