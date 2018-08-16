import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Campaign } from './campaign.model';
import { Observable } from 'rxjs/Observable';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })

};

@Injectable()
export class DataService {

  constructor(
    private http: HttpClient,
  ) {
  }

  getCampaigns(): Observable<Campaign[]> {
    return this.http.get<Campaign[]>(`/campaign/all`);
  }

  getCampaignById(id: string): Observable<Campaign> {
    return this.http.get<Campaign>('/campaign/' + id);
  }

}
