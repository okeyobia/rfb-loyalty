import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

@NgModule({
  imports: [
    RouterModule.forChild([
      {
        path: 'rfb-location',
        loadChildren: './rfb-location/rfb-location.module#RfbloyaltyRfbLocationModule'
      },
      {
        path: 'rfb-event',
        loadChildren: './rfb-event/rfb-event.module#RfbloyaltyRfbEventModule'
      },
      {
        path: 'rfb-event-attendance',
        loadChildren: './rfb-event-attendance/rfb-event-attendance.module#RfbloyaltyRfbEventAttendanceModule'
      },
      {
        path: 'rfb-user',
        loadChildren: './rfb-user/rfb-user.module#RfbloyaltyRfbUserModule'
      }
      /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
    ])
  ],
  declarations: [],
  entryComponents: [],
  providers: [],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class RfbloyaltyEntityModule {}
