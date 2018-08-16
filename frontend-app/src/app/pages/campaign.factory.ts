import {helpers, lorem, random, date } from 'faker';
import { Campaign } from './campaign.model';
import { FixtureFactory } from '../core/fixture-factory';

class CampaignFactory extends FixtureFactory<Campaign> {

    build(attributes?): Campaign {
        return {
            name: lorem.word(),
            goal: lorem.word(),
            total_budget: random.number(100),
            status: lorem.word(),
            platforms: [{
                type: helpers.randomize(['Google', 'Facebook', 'Instagram']),
                status: lorem.word(),
                total_budget: random.number(100),
                remaining_budget: random.number(100),
                start_date: date.past,
                end_date: date.future,
                target_audiance: {
                    languages: helpers.randomize(['FR', 'EN', 'SP']),
                    genders: helpers.randomize(['M', 'F']),
                    age_range: helpers.randomize(['20', '45', '60']),
                    locations: helpers.randomize(['Italy', 'Spain', 'France']),
                    interests: helpers.randomize(['Docker', 'DevOps', 'Cloud'])
                },
                creatives: {
                    header: lorem.word(),
                    description: lorem.word(),
                    url: lorem.word(),
                    image: lorem.word()
                },
                insights: {
                    impressions: random.number(100),
                    clicks: random.number(100),
                    nanos_score: random.number(100),
                    cost_per_click: random.number(100),
                    click_through_rate: random.number(100),
                    advanced_kpi_1: random.number(100),
                    advanced_kpi_2: random.number(100),
                }
            }],
            ...attributes
        };
    }
}

export const campaignFactory = new CampaignFactory();
