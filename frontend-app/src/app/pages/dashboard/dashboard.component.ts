import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import { DataService } from '../data.service';
import { Router, ActivatedRoute } from '@angular/router';
import { Campaign } from '../campaign.model';


@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styles: ['./dashboard.component.css'],
  providers: [DataService]
})
export class DashboardComponent implements OnInit {

  campaigns: Campaign[];
  campaign: Campaign;
  load = false;
  
  constructor(public _dataService: DataService, public router: Router, private route: ActivatedRoute) { }

  ngOnInit() {
    this.getCampaigns();
  }

  sendCampaign(id: string) {
    this.router.navigate(['campaign', id], { relativeTo: this.route });
  }

  getCampaigns() {
    this._dataService.getCampaigns().subscribe(data => {
      this.campaigns = data;
      this.load = false;
      return this.load;
    },
      error => {
        console.error('Error loading campaigns!');
        return Observable.throw(error);
      }
    );
  }
}
