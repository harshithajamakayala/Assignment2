import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BillAdminWorkComponent } from './bill-admin-work.component';

describe('BillAdminWorkComponent', () => {
  let component: BillAdminWorkComponent;
  let fixture: ComponentFixture<BillAdminWorkComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BillAdminWorkComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BillAdminWorkComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
