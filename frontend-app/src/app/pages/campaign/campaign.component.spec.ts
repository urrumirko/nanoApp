import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { CampaignComponent } from './campaign.component';
import { DataService } from '../data.service';
import { HttpClient } from '@angular/common/http';

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

describe('getCampaign', () => {
  let httpClient: HttpClient;
  let service: DataService;
  beforeEach(() => { service = new DataService(httpClient); });
  it('return single campaign from id',
    (done: DoneFn) => {
      service.getCampaignById('1').subscribe(value => {
        expect(value).toBe('observable value');
        done();
      });
  });
})
