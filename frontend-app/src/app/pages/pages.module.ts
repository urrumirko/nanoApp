import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';

import { ClarityModule } from 'clarity-angular';

import { DataService } from './data.service';

import { DashboardComponent } from './dashboard/dashboard.component';
import { CampaignComponent } from './campaign/campaign.component';

const components = [
  DashboardComponent,
  CampaignComponent,
];

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    RouterModule,
    ClarityModule,
  ],
  declarations: [
    ...components,
  ],
  exports: [
    ...components,
  ],
  providers: [
    DataService,
  ]
})
export class PagesModule { }
