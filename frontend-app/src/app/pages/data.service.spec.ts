import { DataService } from "./data.service";
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { TestBed } from "@angular/core/testing";
import { Campaign } from './campaign.model';
import { campaignFactory } from './campaign.factory';

describe('DataSerivce', () => {
    const CAMPAIGNS = [] as Campaign[];
    const CAMPAIGN = campaignFactory.build();

    let service: DataService;
    let httpMock: HttpTestingController;

    beforeEach(() => {
        TestBed.configureTestingModule({
            imports: [HttpClientTestingModule],
            providers: [DataService]
        });

        service = TestBed.get(DataService);
        httpMock = TestBed.get(HttpTestingController);
    });

    afterEach(() => {
        httpMock.verify();
    });

    it('should get the campaigns', () => {
        service.getCampaigns().subscribe(response => {
            expect(response).toEqual(CAMPAIGNS);
        })

        httpMock
            .expectOne({method: 'GET', url: `/campaign/all`})
            .flush(CAMPAIGNS);
    });

    it('should get campaign by Id', () => {
        const id = '1';
        service.getCampaignById(id).subscribe(response => {
            expect(response).toEqual(CAMPAIGN);
        })

        httpMock
            .expectOne({method: 'GET', url: `/campaign/` + id})
            .flush(CAMPAIGN);
    });

});
