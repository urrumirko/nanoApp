import { NanoDashboardPage } from './app.po';

describe('nano-dashboard-page App', function() {
  let page: NanoDashboardPage;

  beforeEach(() => {
    page = new NanoDashboardPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
