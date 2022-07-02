import type { NextPage } from 'next'


const Store: NextPage = () => {
    const version = process.env.VERSION;
    
    return (
        <div>
            <h1>
                {version}
            </h1>
        </div>
    )
}

export default Store;