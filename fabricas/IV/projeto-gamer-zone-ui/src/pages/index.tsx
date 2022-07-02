import { Divider, ScaleFade } from '@chakra-ui/react'
import type { NextPage } from 'next'
import HomeCarousel from '../components/home/carousel'
import HomeFooter from '../components/home/footer'
import HomeInfo from '../components/home/info'
import HomeCoins from '../components/home/coins';

const Home: NextPage = () => {
  return (
    <div>
        {/* <HomeNav /> */}
        <ScaleFade in={true} initialScale={0.1}>
          <HomeCarousel />
        </ScaleFade>
        <HomeInfo />
        <Divider />
        <HomeCoins />
        <HomeFooter />
    </div>
  )
}

export default Home
