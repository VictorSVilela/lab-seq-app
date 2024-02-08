import { Component } from '@angular/core';
import { LabseqService } from '../service/labseq.service';

@Component({
  selector: 'app-labseq',
  templateUrl: './labseq.component.html',
  styleUrls: ['./labseq.component.css']
})
export class LabseqComponent {
  n: number = 0;
  result: number = 0;  

  constructor(private labseqService: LabseqService) {}

  challengeTitle = 'Challange LabSeq';

  getLabSeq(): void {
      if (this.n !== undefined) {
        this.labseqService.getLabSeqValue(this.n).subscribe(
          (r) => {
            this.result = r;
          }
        );
      }
  }
}
