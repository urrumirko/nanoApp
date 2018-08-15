import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })

};

export interface Campaign {
  campaign_id: number;
  name: string;
  goal: string,
  total_budget: number,
  status: string,
  platforms: [{
    type: string,
    status: string,
    total_budget: number,
    remaining_budget: number,
    start_date: Date,
    end_date: Date,
    target_audiance: {
      languages: Array<any>,
      genders: Array<any>,
      age_range: Array<any>,
      locations: Array<any>,
      interests: Array<any>
    },
    creatives: {
      header: string,
      description: string,
      url: string,
      image: string
    },
    insights: {
      impressions: number,
      clicks: number,
      nanos_score: number,
      cost_per_click: number,
      click_through_rate: number,
      advanced_kpi_1: number,
      advanced_kpi_2: number
    }
  }]
};

@Injectable()
export class DataService {

  constructor(
    private http: HttpClient,
  ) {
  }

  getCampaigns(): Observable<any[]> {
    return this.http.get<any>(`/campaign/all`);
  }

  getCampaignById(id: string): Observable<any> {
    return this.http.get<any>('/campaign/' + id);
  }

}
