import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { CampaignComponent } from './campaign.component';
import { DataService } from '../data.service';
import { HttpClient } from '@angular/common/http';
import { Campaign } from '../campaign.model';

describe('CampaignComponent', () => {
  let component: CampaignComponent;
  let fixture: ComponentFixture<CampaignComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CampaignComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CampaignComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

});
