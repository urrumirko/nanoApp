import { Component, OnInit } from '@angular/core';
import { DataService, Campaign } from '../data.service';
import { Observable } from 'rxjs/Rx';
import { Router, ActivatedRoute } from '@angular/router';
import swal from 'sweetalert2';

@Component({
  selector: 'app-campaign',
  templateUrl: './campaign.component.html',
  styleUrls: ['./campaign.component.css'],
  providers: [DataService]
})
export class CampaignComponent implements OnInit {

  campaign: Campaign;
  load = false;

  constructor(public _dataService: DataService, public router: Router, public root: ActivatedRoute) { }

  ngOnInit() {
    let id = this.root.snapshot.paramMap.get('id');
    if (id != null) {
      this.getCampaign(id);
    }
  }

  getCampaign(id: string) {

    this._dataService.getCampaignById(id).subscribe(
      data => {
        // refresh the list
        if (data != null) {
          this.campaign = data;
        }
        return data;
      },
      error => {

        console.error(JSON.stringify(error));
        swal('Error!', 'Impossible to get campaign!', 'error');
        return Observable.throw(error);
      }
    );
  }
}
