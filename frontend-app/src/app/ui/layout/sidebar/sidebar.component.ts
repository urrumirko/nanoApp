import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-sidebar',
  template: `
    <nav>
      <section class="sidenav-content">
        <a class="nav-link" routerLinkActive="active" [routerLink]="['/', 'dashboard']">Overview</a>
      </section>
    </nav>
  `,
  styles: []
})
export class SidebarComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
