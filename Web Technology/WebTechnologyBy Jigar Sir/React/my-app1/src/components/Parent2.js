import React from 'react'
import Child2 from './Child2'
import ErrorBoundary from '../ErrorBoundary'

export default function Parent2() {
  return (
    <div className='container'>
      <h1>Error Boundary</h1>
      <div className="row">
        <div className="col-4"><Child2 p1="https://encrypted-tbn1.gstatic.com/shopping?q=tbn:ANd9GcRHfRlzLMP11V5LnIArecV0LwCwhCzxRI5GyIOBdLMAaRIu5PJz58ebXTvKTqgchTdQaSUdqzT-5aCOKn6AMHDERhGcfGCgDoqrf6__wGDqkI41F_VeLDgB0w&usqp=CAE"/></div>


        <div className="col-4"><Child2 p1="https://encrypted-tbn1.gstatic.com/shopping?q=tbn:ANd9GcTl2QlkFZI1S2p1wK4fo3mrnmHxvVwEaftuPYVylO1F_nNiRYn5pZcFHi7eXcExuCl3IEn9SEuEHrPHQHGeDQskpsxBq3_qg52_cLb7KkMETJqrXqrrEZXWzQ&usqp=CAE"/></div>


        <div className="col-4">
            <ErrorBoundary><Child2 p1 =""/>
            </ErrorBoundary></div>
      </div>
    </div>
  )
}
