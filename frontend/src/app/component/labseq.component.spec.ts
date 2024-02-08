import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LabseqComponent } from './labseq.component';

describe('LabseqComponent', () => {
  let component: LabseqComponent;
  let fixture: ComponentFixture<LabseqComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LabseqComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(LabseqComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
