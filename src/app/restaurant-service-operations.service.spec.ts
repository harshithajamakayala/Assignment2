import { TestBed } from '@angular/core/testing';

import { RestaurantServiceOperationsService } from './restaurant-service-operations.service';

describe('RestaurantServiceOperationsService', () => {
  let service: RestaurantServiceOperationsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(RestaurantServiceOperationsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
